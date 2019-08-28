# study
for  internship 2019/08

2019年 08月　インターンシップ用　プロジェクトです。

# 前準備

## Amazon Correttoのインストール

1. 以下のURLからAmazon Corretto 8をDLする
 https://aws.amazon.com/jp/corretto/
 
2. ダウンロードした	msiを実行する
3. 環境変数を変更する
    JAVA_HOMEにJava jdkフォルダの位置を設定
    Pathに'''%JAVA_HOME%\bin'''を追加
    
    コマンドプロンプトから ```java -version```を実行
    正常にJavaのversionが表示されたらOK
    
## mavenのインストール

1. 以下のURLからMavenをDLする
　https://maven.apache.org/download.cgi
 Binary zip archive
 
2. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
3. 環境変数を設定します。
   M2_HOME にMaven展開先のパスを登録
   Pathに'''%M2_HOME%\bin'''を追加
   
   コマンドプロンプトから ```mvn -v```を実行
   正常にmavenのversionが表示されたらOK
   
## Gradleのインストール

1. 以下のURLからGradleをDLする
   https://gradle.org/releases/
   
2. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
3. 環境変数を設定します。
   GRADLE_HOME にMaven展開先のパスを登録
   Pathに'''%GRADLE_HOME%\bin'''を追加
   
   コマンドプロンプトから ```gradle -version```を実行
   正常にgradleのversionが表示されたらOK
   
## Stsのインストール

1. 以下のURLからSTSをDLする
   https://spring.io/tools
2. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
