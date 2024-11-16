# Platform extension
An extension that uses Platform project https://github.com/qnhant5010/platform.git

The platform will be used as a Git submodule, and to be included in build

## Recipe
Based on https://blog.alllex.me/posts/2023-08-31-git-submodule-composite-build/
1. Include platform project as submodule
    ````shell
    git submodule add https://github.com/qnhant5010/platform.git platform
    git submodule update --init
    ````
    This will pull and put Platform to the directory ``platform/`` as a Git submodule.
    
    **Note:** the submodule needs to be updated manually because Git considers submodule at a _specific commit_, like a
    snapshot.
2. Set up gradle composite build by modifying ``/settings.gradle``
    ````groovy
    rootProject.name = 'platform-extension'
    
    includeBuild('platform')
    ````
3. Declare Platform as dependency of Extension in ``/build.gradle``
    ````groovy
    dependencies {
        implementation 'com.qnhant:platform'
    }
    ````