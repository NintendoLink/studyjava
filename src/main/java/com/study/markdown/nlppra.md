stanforNLP
========
###功能
* Tokenizer(Tokenization):分词，词编号
* ssplit(Sentence Split):句子分割
* lemma(Lemmatization):词形还原
* pos(Part Of Speech):词性标注
* ner(Named entity recognition):命名实体识别
* regexner(Regex Named Entity Recognition):正则化命名实体识别
* parse(Constituency Parse):句法分析
* depparse(Dependency Parse):依存句法分析
---
### 构件坐标
* 算法核心jar，stanford核心jar包，包括一些常用的处理工具
>           <dependency>
>               <groupId>edu.stanford.nlp</groupId>
>               <artifactId>stanford-corenlp</artifactId>
>               <version>${stanfordNLP.Version}</version>
>           </dependency>

* 模型核心，同样是核心jar，一些模型文件
>        <dependency>
>            <groupId>edu.stanford.nlp</groupId>
>            <artifactId>stanford-corenlp</artifactId>
>            <version>${stanfordNLP.Version}</version>
>            <classifier>models</classifier>
>        </dependency>

* 可选语言模型	，可选择jar，如果遇到中文的处理，必须加入此jar，不然无法处理，同样如果有其他语言可以把model替换成model-language。
>        <dependency>
>            <groupId>edu.stanford.nlp</groupId>
>            <artifactId>stanford-corenlp</artifactId>
>            <version>${stanfordNLP.Version}</version>
>            <classifier>models-chinese</classifier>
>        </dependency>

---
### 控制台example(来自官方)
>  
    public static String text = "Joe Smith was born in California. " +
            "In 2017, he went to Paris, France in the summer. " +
            "His flight left at 3:00pm on July 10th, 2017. " +
            "After eating some escargot for the first time, Joe said, \"That was delicious!\" " +
            "He sent a postcard to his sister Jane Smith. " +
            "After hearing about Joe's trip, Jane decided she might go to France one day.";
  
      public static void main(String[] args) throws Exception {
          
          Properties props = new Properties();
  
          props.setProperty("annotators", "tokenize,ssplit,parse, pos, lemma");
  
          StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
  
          CoreDocument document = new CoreDocument(text);
  
          pipeline.annotate(document);
  
          for (CoreLabel coreLabel : document.tokens()) {
              System.out.println(coreLabel);
          }
          // 10th token of the document
          CoreLabel token = document.tokens().get(0);
          System.out.println("Example: token");
          System.out.println(token);
          System.out.println();
  
          // text of the first sentence
          String sentenceText = document.sentences().get(1).text();
          System.out.println("Example: sentence");
          System.out.println(sentenceText);
          System.out.println();

当需要哪个功能时，需要将annotators中加入即可(因为加载模型的原因，运行速度很慢，可能会出现heapsize异常，需要调整jvm运行参数)
* [使用standard Api](https://stanfordnlp.github.io/CoreNLP/api.html)
---
### coreNLP server
1.除了控制台使用标准api调用StanfordNLP接口之外，stanfordNLP还提供了另外一种使用调用方式：搭建本地coreNLP server，对外提供http post和java client调用方式。
使用姿势如下:
* 标准版(不包含中文)
在存放stanfordNLP依赖的文件夹(可以不包括model-chinese)下执行java命令：
> java -mx4g -cp "*" edu.stanford.nlp.pipeline.StanfordCoreNLPServer -port 9000 -timeout 15000
* 如果要处理中文，则此文件夹必须包含model-chinese，命令变成如下：
> java -Xmx4g -cp "*" edu.stanford.nlp.pipeline.StanfordCoreNLPServer -serverProperties StanfordCoreNLP-chinese.properties -port 9000 -timeout 15000。

2.效果是server启动了9000端口
* 可以在浏览器中打开localhost:9000,然后post data，直接可视化展示careNLP调用结果
* 模拟post请求，接收调用结果,可以linux下的wget和curl模拟post请求
wget方式
> 
    
    wget --post-data 'The quick brown fox jumped over the lazy dog.' 'localhost:9000/?properties={"annotators":"tokenize,ssplit,pos","outputFormat":"json"}' -O -

curl方式
> 

    curl --data 'The quick brown fox jumped over the lazy dog.' 'http://localhost:9000/?properties={%22annotators%22%3A%22tokenize%2Cssplit%2Cpos%22%2C%22outputFormat%22%3A%22json%22}' -o -

* 利用java client发送数据，接收请求结果。这样做的好处：不用每次都加载模型？
> * The models are not re-loaded every time your program runs. This is useful when debugging a block of code which runs CoreNLP annotations, as the CoreNLP models often take on the order of minutes to load from disk.
> * The machine running the server has more compute and more memory than your local machine. Never again must Chrome and CoreNLP compete for the same memory.

example(来自官方)：
 >
  
    Properties props = new Properties();
    props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    StanfordCoreNLPClient pipeline = new StanfordCoreNLPClient(props, "http://localhost", 9000, 2);
    String text = ... // Add your text here!
    Annotation document = new Annotation(text);
    pipeline.annotate(document);
    
注：这种方式尝试后未果，在启动server之后的第一次java client访问后,client会抛出
> 
    
    java.lang.NoClassDefFoundError:com/google/protobuf/GeneratedMessageV3$ExtendableMessageOrBuilder
在之后的访问中，server会抛出
>
    
    java.lang.NoClassDefFoundError:edu/stanford/nlp/pipeline/CoreNLPProtos$Docume
    
* [coreNLP server搭建](https://stanfordnlp.github.io/CoreNLP/corenlp-server.html)