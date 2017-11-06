SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1a4ac8dfcfd30c03dc21fee41ea4e3cf"
SRC_URI[sha256sum] = "713eff23f61d9766f02b40cc6cfa73acd31d126a0c6a775903f79c9adebc77c5"
