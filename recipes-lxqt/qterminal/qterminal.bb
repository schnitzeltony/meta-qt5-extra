SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "d9e67906232c827a07c030ade1356db1a29fdc48"
PV = "1.0.0"

S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${datadir}/appdata \
"
