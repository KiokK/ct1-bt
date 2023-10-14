# StringUtils plugin
The plugin is published with the included libraries
```groovy
jar {
    duplicatesStrategy(DuplicatesStrategy.EXCLUDE)
    manifest {
        attributes('Implementation-Title': project.name,
                'Implementation-Version': project.version)
    }
    dependsOn javadocJar, sourcesJar
    from {
        configurations.compileClasspath.collect { it.isDirectory() ? it : zipTree(it) }
        configurations.compileClasspath.findAll { it.name.endsWith('jar') }.collect { zipTree(it) }
    }
}
```
## Class
- [StringUtils.java](/util/src/main/java/by/kihtenkoolga/StringUtils.java)
- [StringUtilsTest.java](/util/src/test/java/by/kihtenkoolga/StringUtilsTest.java)

(*links for github)

### Build project
```
./gradlew build
```
Local generated .jar: [/build/libs/util-1.3.5.jar](/build/libs/)
(*link for idea)
### Running tests
```
gradle test --tests 'by.kihtenkoolga.*'
```
### Display directories with test reports
```
gradle -q showDirs
```
Or find them in local [/my-reports](/my-reports) (*link for idea)
### Uploading the library to the local folder /.m2
```
gradle publishToMavenLocal
```
You can find the ".jar" at a similar dir:
`___C:\Users\USER_NAME\\.m2\repository\by\kihtenkoolga\utils\1.3.5___\`

After that, the library can be used in other projects after injecting 
```groovy
dependencies {
    implementation "by.kihtenkoolga:utils:1.3.5"
}
```
