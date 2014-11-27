DESCRIPTION = "OpenSprinkler for BeagleBone"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=783b7e40cdfb4a1344d15b1f7081af66"

inherit python-dir systemd

SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/Dan-in-CA/OSPi;branch=master"

#SRC_URI += "file://beaglebone.patch;apply=no"

S = "${WORKDIR}/git"

osbo_dir = "/home/root/OSBo"

do_install() {
    install -m 0755 -d ${D}${osbo_dir}/

    install -m 0644 ${S}/*.py ${D}${osbo_dir}/
    install -m 0644 ${S}/*.md ${D}${osbo_dir}/
    install -m 0644 ${S}/gv_reference.txt ${D}${osbo_dir}/

    rsync -a ${S}/data ${D}${osbo_dir}/
    rsync -a ${S}/i18n ${D}${osbo_dir}/
    rsync -a ${S}/plugins ${D}${osbo_dir}/
    rsync -a ${S}/static ${D}${osbo_dir}/
    rsync -a ${S}/templates ${D}${osbo_dir}/
    rsync -a ${S}/web ${D}${osbo_dir}/

    rm ${D}${osbo_dir}/data/.gitignore
    rm ${D}${osbo_dir}/i18n/.gitignore

    install -m 0755 -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${S}/ospi.service ${D}${systemd_unitdir}/system/
}

FILES_${PN} += "${osbo_dir}"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "ospi.service"

PACKAGE_ARCH = "all"
