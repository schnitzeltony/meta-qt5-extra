DESCRIPTION = "Reading, creating, and manipulating file archives"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

KDE_BRANCH = "${@base_contains("DISTRO_FEATURES", "wayland", "sebas/wayland", "Plasma/5.1",d)}"
SRCREV = "${@base_contains("DISTRO_FEATURES", "wayland", "7927dea10f9435cc39addfa9e7920c8ec0bc7d6e", "be5d2aed3cbfd7bef9741a8aa6f52a0eadb04b19",d)}"
inherit kde

SRC_URI += "file://0001-fix-configuration-on-x-less-systems.patch"

DEPENDS += "${@base_contains("DISTRO_FEATURES", "wayland", "kwayland", "qtx11extras", d)}"

#cmake-lib

#CMAKE_HIDE_ERROR[dir1] = "KF5I18n/KF5I18nTargets.cmake, -cccoutforoe filecheckloop"

#DEPENDS += "qtscript"


