import org.dotnet.ci.pipelines.Pipeline
import jobs.generation.GenerationSettings

// Tests creation of a pipeline that triggers on pushes with non-string parameter types
def newPipeline = Pipeline.createPipeline(this, 'foopipeline.groovy')

try {
    // Parameters
    newPipeline.triggerPipelineOnPush(['Hello':false])
}
catch (e) {
    //???
}