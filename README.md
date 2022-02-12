# A programozás módszertana I.

## Munkakörnyezet

* Töltse le és telepítse a legfrissebb JDK-t: https://www.oracle.com/java/technologies/downloads/
* Állítsa be a környezeti változókat:
    * On Windows in Commandline:
        * set JAVA_HOME=C:\Program Files\Java\jdk-17.0.2
        * set PATH=%JAVA_HOME%\bin;%PATH%
    * On Linux in Terminal:
        * export JAVA_HOME=/opt/jdk-17.0.2
        * export PATH=$JAVA_HOME/bin:$PATH
* Töltse le és telepítse a Gitet: https://git-scm.com/download/win
* Töltse le és telepítse a Mavent (Binary): https://maven.apache.org/download.cgi
* Tömörítse ki a Java mappába
* Töltse le és telepítse a IntelliJ IDEA-t: https://www.jetbrains.com/idea/download/#section=windows
* Klónozza le ezt a repository-t:
    * Kattintson a zöld Clone gombra
    * Másolja ki az URL-t
    * Indítsa el az IntelliJ IDEA-t
    * Válassza a File / New / Project from Version Control... opciót
    * Illessze be az URL-t
    * Kattintson a Clone gombra
* Regisztráljon itt: https://github.com/
* IntelliJ-ben:
    * Válassza a File / Settings... opciót
    * Válassza a Version Control / GitHub opciót a bal oldalon
    * Kattintson az Add... ikonra
    * Válassza a Log In via GitHub... opciót
    * Kattintson az Authorize in GitHub gombra

## Projektstruktúra

* pom.xml
* src:
    * main:
        * java: alkalmazás forráskódjai
        * resources: alkalmazás erőforrás állományai
    * test (nem része az alkalmazásnak):
        * java: tesztek forráskódjai
        * resources: tesztek erőforrás állományai
