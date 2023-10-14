# Project
## Modules
- [app](/app) (*link for idea)
  - In build.gradle:
    ```groovy
    dependencies { 
        implementation project(':core')
    }
    ```
- [core](/core)(*link for idea) - contains util class
  - In build.gradle:
    ```groovy
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
Run tests from core module and get reports to local folder: [project/my-reports](my-reports) (*link for idea)
```
./gradlew takeReports
```
