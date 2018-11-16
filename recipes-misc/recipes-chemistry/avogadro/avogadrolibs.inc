SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95b8695b33e17e83db253ab07da4455a"

inherit cmake_qt5 pythonnative

PV = "1.92.0"
SRC_URI = "git://github.com/OpenChemistry/avogadrolibs.git"
SRCREV = "c22000b59a810529ce306089d1c78e0d1ebbd6c3"
S = "${WORKDIR}/git"
