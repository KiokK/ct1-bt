package by.kiok.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ReportsPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.tasks.register("deleteReportDir") {
            doFirst {
                project.delete "${project.rootDir}/my-reports"
            }
        }

        project.tasks.register('takeReports') {
            dependsOn 'deleteReportDir'

            onlyIf {
                project.file("${project.getRootProject().buildDir}").exists()
            }
            doFirst {
                project.copy {
                    from("${project.getRootProject().buildDir}/reports")
                    into("${project.rootDir}/my-reports/reports")
                }
            }
        }
    }
}
