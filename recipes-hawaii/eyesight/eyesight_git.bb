SUMMARY = "Image viewer for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit hawaii

DEPENDS += "qttools-native"

SRCREV = "7ff55701dde114df2911c937143499f73d0f4e09"
PV = "0.1.4+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/appdata"
