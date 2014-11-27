FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://opensprinkler-rtc.cfg"

KERNEL_CONFIG_FRAGMENTS = " \
    ${WORKDIR}/opensprinkler-rtc.cfg \
    "
