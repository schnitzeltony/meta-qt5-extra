SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "a682613483312544b67cbfd202c7a4db29ce07b8"
PV = "1.4.0"

S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}/metainfo"
