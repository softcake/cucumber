#!/bin/bash
# This script will build the project.

set -ev

function strongEcho {
  echo ""
  echo "================ $1 ================="
}

if [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_SECURE_ENV_VARS" == "true" ]; then

	strongEcho 'Build Branch ['$TRAVIS_BRANCH']'

	./gradlew release sonarqube bintrayUpload artifactoryPublish\
	-Dorg.ajoberstar.grgit.auth.username=${GH_TOKEN} \
	-Dorg.ajoberstar.grgit.auth.password

else

    strongEcho 'Build, no analysis => Branch ['$TRAVIS_BRANCH'] Pull Request ['$TRAVIS_PULL_REQUEST']'

    # Build branch, without any analysis
    ./gradlew build sonarqube
fi

exit 0;

