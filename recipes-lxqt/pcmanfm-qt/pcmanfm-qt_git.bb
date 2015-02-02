SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras glib-2.0 libxcb libfm menu-cache"

SRCREV = "5eb531427aed5b76c54f4694a5f28114e3288477"
PV = "0.8.0+git${SRCPV}"

FILES_${PN}-translations = " \
    ${datadir}/libfm-qt/translations \
    ${datadir}/pcmanfm-qt/translations \
"
