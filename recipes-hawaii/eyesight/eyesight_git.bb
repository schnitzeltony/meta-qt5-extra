SUMMARY = "Image viewer for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit hawaii

DEPENDS += "qttools-native"

SRCREV = "b2cb44436240a26d2f3eb2c3c37f8cd5b9f9ec2a"
PV = "0.1.2+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/appdata"
