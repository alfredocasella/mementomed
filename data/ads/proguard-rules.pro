# proguard-rules.pro (module root)
# Keep serializer classes and common android stuff
-keepclassmembers class kotlinx.serialization.** { *; }
-keep class com.mementomed.** { *; }

