SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras glib-2.0 libexif pcmanfm-qt libxfixes"

SRCREV = "a68b3d7a9f86f8d8013717bc2ff8d76f32da3acc"
PV = "0.4.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
