SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

SRC_URI += " \
	file://0001-make-broken-glib-a-configure-option-we-cannot-run-co.patch \
	file://0002-fix-build-for-QT_NO_SESSIONMANAGER.patch \
"
SRCREV = "eab967901725ce9e553f768cf549a2b5cc26b351"
PV = "5.5.0"

FILES_${PN} += " \
	${datadir}/k*5 \
	${datadir}/dbus-1 \
	${libdir}/plugins \
"

FILES_${PN}-dbg += " \
	${libdir}/plugins/.debug \
	${libdir}/plugins/kf5/*/.debug \
	${libdir}/plugins/*/.debug \
"
