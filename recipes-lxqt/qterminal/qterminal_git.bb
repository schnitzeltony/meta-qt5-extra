SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "aeb2f1f570d7a1773a5eb586e4b56c3218a78cea"
PV = "0.9.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
