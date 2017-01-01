SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "eb6ac8037a071779a357cbe943d969a11497f799"
PV = "0.7.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
