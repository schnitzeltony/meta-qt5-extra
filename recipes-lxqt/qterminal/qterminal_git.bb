SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "e4a56827d31aee8e0b285a155dbda7516f371864"
PV = "0.8.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
