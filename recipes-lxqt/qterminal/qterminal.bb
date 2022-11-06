SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "1358242f73fc28100ef2c9d431ed043226662f70"
PV = "1.2.0"

S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}/metainfo"
