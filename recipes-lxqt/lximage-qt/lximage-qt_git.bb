SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "942e9f66b097d1d366055672d59c6cffcd17a1da"
PV = "0.5.1"

FILES_${PN} += "${datadir}/icons"
