SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "a0d0ebac0f97bc155578e7cacccdfcdcce43b1fa"
PV = "1.1.0"

S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}/metainfo"
