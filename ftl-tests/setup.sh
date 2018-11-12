#!/bin/sh

if [ "$GCLOUD_SERVICE_KEY" = "" ]; then
  echo "GCLOUD_SERVICE_KEY env variable is empty. Exiting."
  exit 1
fi

# Export to secrets file
echo $GCLOUD_SERVICE_KEY | base64 -di > gcloud-service-key.json

# Set project ID
gcloud config set project $GOOGLE_PROJECT_ID

# Auth account
gcloud auth activate-service-account andrii-chubko-ftl@android-simple-boilerplate.iam.gserviceaccount.com --key-file gcloud-service-key.json

# Delete secret
rm gcloud-service-key.json
