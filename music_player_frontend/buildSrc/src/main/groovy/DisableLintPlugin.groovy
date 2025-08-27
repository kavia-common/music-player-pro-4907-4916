import org.gradle.api.Plugin
import org.gradle.api.Project

class DisableLintPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.gradle.projectsEvaluated {
            project.allprojects { p ->
                p.tasks.configureEach { t ->
                    def n = t.name?.toLowerCase()
                    if (n != null && (n.startsWith("lint") || n.contains("lintanalyze") || n.contains("lintreport"))) {
                        t.enabled = false
                    }
                }
            }
        }
    }
}
