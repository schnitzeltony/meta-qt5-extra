SUMMARY = "A library for rendering PostScript(TM) documents"
HOMEPAGE = "https://www.freedesktop.org/wiki/Software/libspectre/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "ghostscript"

inherit autotools-brokensep pkgconfig

SRC_URI = "http://libspectre.freedesktop.org/releases/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "cf60b2a80f6bfc9a6b110e18f08309040ceaa755210bf94c465a969da7524d07"
PV = "0.2.10"
