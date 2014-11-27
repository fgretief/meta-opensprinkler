require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "An image for OpenSprinkler firmware"

LICENSE = "MIT"

IMAGE_INSTALL += " \
    packagegroup-opensprinkler \
    lua \
    "
