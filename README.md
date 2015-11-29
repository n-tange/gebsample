##動作環境
* javaがインストールされている。（2015/11時点 java version "1.8.0_66"で確認）
* gitがインストールされている。（githubからクローンができれば良い）
* Firefoxがデフォルトディレクトリにインストールされている。（2015/11時点　FireFox 42.0で確認）

Firefoxをデフォルトインストールすると、以下のディレクトリにfirefoxの実行バイナリが配置される。

    Windows  
    C:¥Program Files¥Mozilla Firefox¥firefox.exe (64bit)  
    C:¥Program Files (x86)¥Mozilla Firefox¥firefox.exe (32bit)  
    Mac  
    /Applications/Firefox.app/Contents/MacOS/firefox-bin  

seleminu-webdriverが上記のバイナリを参照するようになっているので、このディレクトリにfirefoxをインストールしていない場合は、build.gradleに以下の記述を追加する。


    test{
        //Windowsの場合（Windowsでもパスの指定はスラッシュで指定する良い）
        systemProperties "webdriver.firefox.bin": "D:/myPrograms/Mozilla Firefox/firefox.exe"
    }

また、avast アンチウイルスソフトがインストールされているとGebによるFirefoxの起動に失敗するので、実行時はavastによる保護を解除する。

##動かし方
Githubの
HTTPS clone URL をコピーして、リポジトリのクローンを作成する。  
クローンを配置するディレクトリを作るのを忘れずに。

    mkdir clone  
    cd clone_test  
    git clone https://github.com/n-tange/gebsample.git

gebsampleのディレクトリに移動して、Gradleのwrapperタスクを実行する。

    cd gebsample  
    windows  
    gradlew wrapper  

    UNIX系  
    ./gradlew wrapper

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

##参考
* 脱・独自改造！ GebでWebDriverをもっとシンプルに
http://goo.gl/Ho8AxF
* Geb公式(メニューのMANUALでマニュアルを参照可能)
http://www.gebish.org/
* Gradle 日本語ドキュメント 
http://gradle.monochromeroad.com/docs/
* Groovyを知らない人のためのbuild.gradle読み書き入門 
http://goo.gl/oYn4DS
* Spock Framework Reference 
http://spockframework.github.io/spock/docs/1.0/index.html

##メモ

    gradle init --type groovy-library
