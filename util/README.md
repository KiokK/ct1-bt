# StringUtils plugin
## Class
- [StringUtils.java](/src/main/java/by/kihtenkoolga/StringUtils.java)
- [StringUtilsTest.java](/src/test/java/by/kihtenkoolga/StringUtilsTest.java)

### Build project
```
./gradlew build
```
Local generated .jar: [/jar-lib/util-1.3.5.jar](/jar-lib)
### Running tests
```
gradle test --tests 'by.kihtenkoolga.*'
```
### Display directories with test reports
```
gradle -q showDirs
```
Or find them in local [/my-reports](/my-reports)
### Uploading the library to the local folder /.m2
```
gradle publishToMavenLocal
```
You can find the ".jar" at a similar dir:
___C:\Users\USER_NAME\\.m2\repository\by\kihtenkoolga\utils\1.3.5___\

After that, the library can be used in other projects after injecting 
```
dependencies {
    implementation "by.kihtenkoolga:utils:1.3.5"
}
```
