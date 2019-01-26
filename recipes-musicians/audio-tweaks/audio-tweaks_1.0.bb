DESCRIPTION = "Audio latency tweaks"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI += "file://95-audio-tweaks.conf"

do_install() {
    install -d ${D}${sysconfdir}/security/limits.d
    install -m 0644 ${WORKDIR}/95-audio-tweaks.conf ${D}${sysconfdir}/security/limits.d/

}

RDEPENDS_${PN} = "pam-plugin-limits"
