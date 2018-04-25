package io.swagger.codegen.kotlin;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.KotlinClientCodegen;
import io.swagger.codegen.languages.KotlinRetrofit2RxJava2ClientCodegen;
import io.swagger.codegen.options.KotlinClientCodegenOptionsProvider;
import io.swagger.codegen.options.KotlinRetrofit2RxJava2ClientCodegenOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

public class KotlinRetrofit2RxJava2ClientCodegenOptionsTest extends AbstractOptionsTest {

    @Tested
    private KotlinRetrofit2RxJava2ClientCodegen codegen;

    public KotlinRetrofit2RxJava2ClientCodegenOptionsTest() {
        super(new KotlinRetrofit2RxJava2ClientCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(codegen) {{
            codegen.setPackageName(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.PACKAGE_NAME_VALUE);
            times = 1;
            codegen.setArtifactVersion(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.ARTIFACT_VERSION_VALUE);
            times = 1;
            codegen.setArtifactId(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.ARTIFACT_ID);
            times = 1;
            codegen.setGroupId(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.GROUP_ID);
            times = 1;
            codegen.setSourceFolder(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.SOURCE_FOLDER);
            times = 1;
            codegen.setEnumPropertyNaming(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.ENUM_PROPERTY_NAMING);
            times = 1;
            codegen.setDateLibrary(KotlinRetrofit2RxJava2ClientCodegenOptionsProvider.DATE_LIBRARY);
        }};
    }
}

