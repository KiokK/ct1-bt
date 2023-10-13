# Project
## Modules
- [app](/app)
  - In build.gradle:
    ```
    dependencies { 
        implementation project(':core')
    }
    ```
- [core](/core) - contains util class
  - In build.gradle:
    ```
    dependencies {
      implementation "by.kihtenkoolga:util:1.3.5"
    }
    ```
### Build project
```
./gradlew build
```
### Running app module
Should print "true" in console.
```
 ./gradlew :app:run  
```
### Running tests plugin
Run tests from core module and get reports to local folder: [project/my-reports](my-reports)
```
./gradlew takeReports
```
