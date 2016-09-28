package b;
import org.gradle.api.*
import org.gradle.api.plugins.*
class GroovinPluginOut implements Plugin<Project> {
	void apply (Project project) {
		project.extensions.create("groovin", GroovinPluginExtensionOut)
		  project.task('groove') << {
            println project.groovin.message
        }
	}

}
class GroovinPluginExtensionOut {
    def String message = 'We be groovin\''
}
