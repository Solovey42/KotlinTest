@echo off
cd/d %~dp0/src
kotlinc lvl1.kt -include-runtime -d lvl1.jar & kotlinc lvl2.kt -include-runtime -d lvl2.jar & kotlinc lvl3.kt -include-runtime -d lvl3.jar & kotlinc lvl4.kt -include-runtime -d lvl4.jar & kotlinc lvl5.kt -include-runtime -d lvl5.jar & kotlinc lvl6.kt -include-runtime -d lvl6.jar