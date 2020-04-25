SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "b4f93059c028b5f8f3313dbc25643de0e823eb46"
PV = "0.15.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
