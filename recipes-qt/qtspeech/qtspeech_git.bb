def get_qt5_layerpath(d):
    return d.getVar("BBFILE_PATTERN_qt5-layer").replace("^", "")
    

require ${@get_qt5_layerpath(d)}/recipes-qt/qt5/qt5.inc
require ${@get_qt5_layerpath(d)}/recipes-qt/qt5/qt5-git.inc

SUMMARY = "Qt Speech support"
LICENSE = "GFDL-1.3 & (LGPL-3.0-only | GPL-2.0-or-later) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
"

DEPENDS += "qtbase"

SRCREV = "dabefb96b50480587ff8fcca2026920e1eec0e1a"
PV = "5.15.5+git${SRCPV}"
