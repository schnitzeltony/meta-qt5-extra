SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68485d31f72dbb8611179b6c7515617b"

inherit cmake_qt5 python3native

PV = "1.97.0"
SRC_URI = " \
    git://github.com/OpenChemistry/avogadrolibs.git;branch=master;protocol=https \
    git://github.com/OpenChemistry/molecules;branch=master;protocol=https;name=molecules;destsuffix=molecules \
    git://github.com/OpenChemistry/crystals;branch=master;protocol=https;name=crystals;destsuffix=crystals \
"
SRCREV = "82938e4f5ce188a1e53300d263167bebe717f5b2"
SRCREV_molecules = "b1e16c5dc6d15e72d30dd6c4fca31b2c12025efc"
SRCREV_crystals = "c3e2468fa42360499f0e73d215bddfe2245258aa"


S = "${WORKDIR}/git"
