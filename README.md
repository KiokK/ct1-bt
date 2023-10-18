# Structure

## Modules
- [util](/util) - [StringUtils.java](util/src/main/java/by/kihtenkoolga/StringUtils.java) +
  [StringUtilsTest.java](util/src/test/java/by/kihtenkoolga/StringUtilsTest.java)
- [core](/core) - use util by jar implementation, [Utils.java](/core/src/main/java/by/kiok/Utils.java) +
  [UtilsTest.java](/core/src/test/java/by/kiok/UtilsTest.java)
- [app](/app) - use core by module implementation, [App.java](/app/src/main/java/by/kiok/App.java) with *main()*
- [buildSrs](/buildSrc) - common settings, plugin [ReportsPlugin.groovy](/buildSrc/src/main/groovy/by/kiok/plugin/ReportsPlugin.groovy)
## Build project
- First variant (or rebuild):
    ```
    ./gradlew :util:build
    ./gradlew :core:build
    ./gradlew :app:build
    ./gradlew build
    ```
- Second variant:

  If you have jars in [/jar-lib](/jar-lib)

    ```
    ./gradlew build
    ```

## Run
Print 'true' to console.
- From console (Task :app:run):
  ```
  ./gradlew run
  ```
- By jar: run [jar-libapp/app-1.0.jar](/jar-lib/app/app-1.0.jar)

## Reports
Only if project is built.
1.  ```
    ./gradlew takeReports
    ```
2. To [my-reports](/my-reports) in [index.html](/my-reports/reports/tests/test/index.html)
