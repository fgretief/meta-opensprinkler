DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
HOMEPAGE = "https://github.com/adafruit/adafruit-beaglebone-io-python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rst;beginline=143;endline=146;md5=1bb58cc1613d3c0b2a875be9d9039d34"

SRCNAME = "Adafruit_BBIO"

SRC_URI = "http://pypi.python.org/packages/source/A/Adafruit_BBIO/${SRCNAME}-${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

COMPATIBLE_MACHINE = "beaglebone"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI[md5sum] = "94cd218a15ca7c474bc53c1a94d905ae"
SRC_URI[sha256sum] = "c79ca2dd23bc0416bed3fc6f99d6d9afcf506f292baefdbcd4957d673faed6d2"
