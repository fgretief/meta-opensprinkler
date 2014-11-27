DESCRIPTION = "OpenSprinkler"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=647ffa0a782330539e2b82de973196c2"

SRCREV="936a6b7300b329667940501c6f7cb33ef4c3bdf9"

SRC_URI = "git://github.com/Dan-in-CA/OSPi.git;branch=master"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "python"

do_install() {
	install -m 0755 -d ${D}/home/OSBo/
	cp -r ${S}/. ${D}/home/OSBo/
	rm -rf ${D}/home/OSBo/.git
}

FILES_${PN} = "/home/OSBo/"

# Still a work in progress ...
