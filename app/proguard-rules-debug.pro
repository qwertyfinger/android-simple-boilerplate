# This is a configuration file for ProGuard.
# https://www.guardsquare.com/en/products/proguard/manual/usage

# Print final merged ProGuard configurations in the following file.
-printconfiguration build/outputs/mapping/configuration.txt

# Disable warnings, obfuscation and optimizations in debug builds.
-ignorewarnings
-dontobfuscate
-dontoptimize

# Retain some debug information about local variables (only needed line in debug build type).
-keepattributes LocalVariableTable, LocalVariableTypeTable

# Fixes issue with FTL + Dagger, see https://stackoverflow.com/questions/52759473/firebase-test-lab-fails-when-using-proguard-dagger/52958092#52958092
-keep class javax.inject.** { *; }

# *** CRASHLYTICS ***
-keepattributes SourceFile, LineNumberTable
-keep public class * extends java.lang.Exception
-renamesourcefileattribute SourceFile

# *** OKHTTP ***
# A resource is loaded with a relative path so the package of this class must be preserved.
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase

# *** RETROFIT ***
-dontnote retrofit2.Platform

# Retrofit might look at the type information of exceptions at runtime.
-keepattributes Exceptions

# Retain service method parameters when optimizing.
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}

# *** COROUTINES ***
# ServiceLoader support
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}

# Most of volatile fields are updated with AFU and should not be mangled
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}
