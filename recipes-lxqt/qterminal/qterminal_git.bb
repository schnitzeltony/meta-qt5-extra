SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "6e243af21c6304b1e5a788b481fa13ed7da6c863"
PV = "0.14.1"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
