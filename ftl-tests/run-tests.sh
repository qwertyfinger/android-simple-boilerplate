#!/bin/sh
BUILD_ID=$1
TEST_DIR=$2

test_apk() {
	RESULTS_DIR=$1_${BUILD_ID}
	
    gcloud firebase test android run \
	    --type instrumentation \
	    --app $2 \
	    --test $3 \
	    --device model=Nexus6P,version=27,locale=en_US,orientation=portrait \
	    --timeout 20m \
	    --results-dir=${RESULTS_DIR} \
	    --environment-variables coverage=true,coverageFile=/sdcard/tmp/code-coverage/connected/coverage.ec \
	    --directories-to-pull=/sdcard/tmp \
	    --no-record-video \
	    --no-performance-metrics

	TEST_RESULT=$?

    # Make result dir
    mkdir -p "$TEST_DIR/$RESULTS_DIR"
	# Pull down test results
	gsutil -m cp -r -U "gs://test-lab-da8p772xit7ci-m2icr21r8ttyz/$RESULTS_DIR/*" "$TEST_DIR/$RESULTS_DIR"

	return ${TEST_RESULT}
}

test_apk \
	"app" \
	"app/build/outputs/apk/debug/app-debug.apk" \
	"app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk"