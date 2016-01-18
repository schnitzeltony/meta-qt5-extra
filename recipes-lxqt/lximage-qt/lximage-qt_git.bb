SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras glib-2.0 libexif pcmanfm-qt libxfixes"

SRCREV = "9c4fc7cb60480c787cd87062dc63d62dcc699a78"
PV = "0.4.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
