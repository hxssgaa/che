# How to Build Theia Image

## Build image manually
Example:
docker build -t eclipse/che-theia:nightly --build-arg GITHUB_TOKEN={your token} --build-arg THEIA_VERSION=0.3.10 .

## Theia version

There's a default Theia version set in the script. This version is then injected in all package.jsons.
You can override `THEIA_VERSION` by exporting the env before running the script

## GITHUB_TOKEN

Once of Theia dependencies calls GitHub API during build to download binaries. It may happen that GitHub API rate limit is exceeded.
As a result build fails. It may not happen at all. If it happens, obtain GitHub API token