##動かし方
Githubの
HTTPS clone URL をコピーして、リポジトリのクローンを作成する。  
クローンを配置するディレクトリを作るのを忘れずに。

 mkdir clone  
 cd clone_test  
 git clone https://github.com/n-tange/gebsample.git

gebsampleのディレクトリに移動して、Gradleのwrapperタスクを実行する。

cd gebsample  
gradle wrapper

wrapperタスクを実行し、BUILD SUCCESSFULと表示される。  
動作確認のため、gradleのタスクの一覧を表示するタスクをgradleラッパーから実行してみる。

windows  
 gradlew tasks  

 UNIX系  
 ./gradlew tasks

gradleラッパーの動作が確認できたら、テストを実行してみる。  
以下のようにtestを実行するタスクを実行する。  
うまくいけば、Firefoxが起動し、www.gebish.comが開いて、別のページに遷移後、Firefoxが閉じる。
コンソールにはBUILD SUCCESSFULと表示される

 windows  
 gradlew test  

 UNIX系  
 ./gradlew test

##メモ

gradle init --type groovy-library
