package b;
import org.gradle.api.*
import org.gradle.api.plugins.*
class GroovinPlugin implements Plugin<Project> {
	void apply (Project project) {
		project.extensions.create("groovin", GroovinPluginExtension)
		  project.task('groove') << {
            println project.groovin.message
        }
	}

}
class GroovinPluginExtension {
    def String message = 'We be groovin\''
}
