# study
for  internship 2019/08

2019年 08月　インターンシップ用　プロジェクトです。

# 前準備

## 環境構築

### Amazon Correttoのインストール

1. 以下のURLからAmazon Corretto 8をDLする
 https://aws.amazon.com/jp/corretto/
 
1. ダウンロードした	msiを実行する
1. 環境変数を変更する
    JAVA_HOMEにJava jdkフォルダの位置を設定
    Pathに'''%JAVA_HOME%\bin'''を追加
    
    コマンドプロンプトから ```java -version```を実行
    正常にJavaのversionが表示されたらOK
    
### mavenのインストール

1. 以下のURLからMavenをDLする
　https://maven.apache.org/download.cgi
 Binary zip archive
 
1. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
1. 環境変数を設定します。
   M2_HOME にMaven展開先のパスを登録
   Pathに'''%M2_HOME%\bin'''を追加
   
   コマンドプロンプトから ```mvn -v```を実行
   正常にmavenのversionが表示されたらOK
   
### Gradleのインストール

1. 以下のURLからGradleをDLする
   https://gradle.org/releases/
   
1. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
1. 環境変数を設定します。
   GRADLE_HOME にMaven展開先のパスを登録
   Pathに'''%GRADLE_HOME%\bin'''を追加
   
   コマンドプロンプトから ```gradle -version```を実行
   正常にgradleのversionが表示されたらOK
   
### GITのインストール
1. 以下のURLからGradleをDLする
   https://git-scm.com/download/win

### Stsのインストール

1. 以下のURLからSTSをDLする
   https://spring.io/tools
1. ダウンロードしたzipを解凍し、Cフォルダの下に配置する
1. EGitを導入します。Help ⇒ Install New Software… を実行する
「使用可能なソフトウェア」の画面が開くので「追加」ボタンをクリックします。
「リポジトリーの追加」ダイアログが開くので「名前」「ロケーション」の項目にそれぞれ入力します。
   - Name：Egit（任意の名称でOK）
   - ローケーション：http://download.eclipse.org/egit/updates
1. 入力したら「OK」ボタンをクリックします。すると、インストール可能なプラグインが表示されますので、全て選択して「次へ」ボタンをクリックします。
1. Eclipseの「ウィンドウ」→「ビューの表示」→「その他」から「Git」の「Git リポジトリー」を選択し、表示します。

