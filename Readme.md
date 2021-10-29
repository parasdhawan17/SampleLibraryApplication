Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.parasdhawan17.SampleLibraryApplication:silly-sdk:1.6'
          implementation 'com.github.parasdhawan17.SampleLibraryApplication:custom-dialog:1.6'
          implementation 'com.github.parasdhawan17.SampleLibraryApplication:super-silly-sdk:1.6'
	}
